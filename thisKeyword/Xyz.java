package thisKeyword;
// "this" keyword is used to refer current class instance variable
// if there is an ambiguity between instance variable and parameter, this keyword resolve the problem of ambiguity
// if instance variable and parameter are same, then we are using this keyword to distinguish local variable and instance variable

public class Xyz {
    int num;
    int x;
    public void setNum(int x) {
        num = x;   // for this condition there is no need of this keyword
        this.x = x;    // here is the need of "this" keyword otherwise it will show the default value of i, i.e 0
    }

    public void display() {
        System.out.println(num);
    }
}
