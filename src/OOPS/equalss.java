package OOPS;

import java.util.Objects;

// equals - is predefined object to compare 2 instance of the same class.
// Normal == will check whether instances are of same class or not but it doesn't check with the attribute values of that instances so we need to generate equals and hashcode methods
public class equalss {
    public static void main(String[] args) {
        eqCls obj1 = new eqCls(78);
        eqCls obj2 = new eqCls(90);
        eqCls obj3 = new eqCls(78);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj3));
        System.out.println();
        enum SCORE {
            HIGH, LOW, MEDIUM
        }
        System.out.println(SCORE.HIGH);
        System.out.println(SCORE.LOW);
        System.out.println(SCORE.MEDIUM);
    }
}

class eqCls {
    public int a;

    public eqCls(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        eqCls eqCls = (eqCls) o;
        return a == eqCls.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}