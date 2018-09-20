package main.thinkingInJava.exceptions;


class DynamicFieldException extends Exception{}

public class DynamicField {
    private Object[][] fields;
    public DynamicField(int size){
        fields=new Object[size][2];
        for (int i = 0; i < size; i++) {
            fields[i]=new Object[]{null , null};
        }
    }

    @Override
    public String toString() {
        StringBuilder result =new StringBuilder();
        for (Object[] o: fields
             ) {
            result.append(o[0]);
            result.append(" : ");
            result.append(o[1]);
            result.append("\n");
        }
        return result.toString();
    }

    private int hasField(String id) {
        for (int i = 0; i < fields.length; i++) {
            if(id.equals(fields[i][0])){
                return i;
            }
        }
        return -1;
    }
    private int getFieldNumber(String id) throws NoSuchFieldException{
        int h = hasField(id);
        if(h==-1){
            throw new NoSuchFieldException();
        }
        return h;
    }
    private int makeField(String id){
        for (int i = 0; i <fields.length ; i++) {
            if (fields[i][0] == null) {
                fields[i][0] = id;
                return i;
            }
        }
            Object[][] tmp = new Object[fields.length+1][2];
            for (int i = 0; i < fields.length  ; i++) {
                tmp[i]=fields[i];
            }
        for (int i = fields.length; i <tmp.length ; i++) {
            tmp[i]=new Object[]{null,null};
        }
        fields=tmp;
            return makeField(id);
        }
        public Object getField(String id) throws NoSuchFieldException {
        return fields[getFieldNumber(id)][1];
    }

    public Object setField(String id, Object obj) throws DynamicFieldException{
        if(obj==null){
            DynamicFieldException dfe =new DynamicFieldException();
            dfe.initCause(new NullPointerException());
            throw dfe;
        }
        int fieldNumber = hasField(id);
        if(fieldNumber==-1){
            fieldNumber = makeField(id);
        }
        Object result = null;
        try {
            result=getField(id);
        }catch (NoSuchFieldException ex){
            throw new RuntimeException(ex);
        }
        fields[fieldNumber][1]=obj;
        return result;

    }

    public static void main(String[] args) {
        DynamicField df = new DynamicField(3);
        try {
            System.out.println(df);
            df.setField("10", "Coca-cola");
            df.setField("11", "Pepsi");
            System.out.println(df);
            df.setField("W", "World wide web");
            df.setField("Moscow",850);
            System.out.println("df.getField(\"W\")" + df.getField("W"));

            df.setField("W","China");

            df.setField("Moscow",null);
            System.out.println(df);
        }catch (NoSuchFieldException | DynamicFieldException ex){
            ex.printStackTrace(System.out);
        }
    }
}
