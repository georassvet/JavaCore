package main.java.com.mokhov.ch9;

import java.util.Random;

public class Question implements SharedConstant {
    Random random =new Random(47);

    int ask(){
        int probably = (int)(100 * random.nextDouble());
        if(probably<30){
            return NO;
        }else if(probably<60){
            return YES;
        }else if(probably<75){
            return LATER;
        }else if(probably<98){
            return SOON;
        }else {
            return NEVER;
        }
    }
}

class AskMe implements SharedConstant{
    static void answer(int i){
        switch(i){
            case NO : {
                System.out.println("No no no");
                break;
            }
            case YES : {
                System.out.println("Yes yes yes");
                break;
            }
            case LATER : {
                System.out.println("May be later");
                break;
            }
            case SOON : {
                System.out.println("Comming soon");
                break;
            }
            case NEVER : {
                System.out.println("Never forever");
                break;
                }
            }
        }
        public static void main(String[] args) {
            Question question =new Question();
            answer(question.ask());
            answer(question.ask());
            answer(question.ask());
            answer(question.ask());
            answer(question.ask());
            answer(question.ask());

    }
    }
