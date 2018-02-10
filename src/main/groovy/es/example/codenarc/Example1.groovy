package es.example.codenarc

class Example1 {

    String username

    List var1 = [123, [3, 4, [x:99], 5]]
    List var2 = [12, [2, 4, [x:99], 3]]

    boolean isValidUserName() {
        if(username) {
            true
        }
        false
    }

    List<List> vars() {
        [var1, var2]
    }
}
