package com;

public interface Bell {
    void ring();
}

class Cellphone{
    public void alarm(Bell bell){
        bell.ring();
    }
}
