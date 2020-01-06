package com.atguigu.bigdata.java.sz;

public class TestEq {
    public static void main(String[] args) {

        UserY user = new UserY();
        user.id = 1;

        UserY user1 = new UserY();
        user1.id = 1;

        System.out.println(user.equals(user1)); // true

        Class<String> stringClass = String.class;
        "abc".getClass();
    }
}

class UserY{
    public int id;

    @Override
    public boolean equals(Object o) {
        if ( o instanceof UserY ) {
            UserY other = (UserY)o;
            return this.id == other.id;
        } else {
            return false;
        }
    }
}
