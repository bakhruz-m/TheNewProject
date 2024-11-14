package validator;

import domain.StudentOrder;
import domain.children.AnswerChildren;

public class ChildrenValidator
{
    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children Check is running");
        return new AnswerChildren();
    }
}