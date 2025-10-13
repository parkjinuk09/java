package sec01.exam07.pack2;

import sec01.exam07.pack1.A; 

public class D extends A { 
    // 다른 패키지지만 상속 관계이므로 protected 접근 ㄱ
    public D() { 
        super(); 
        this.field = "value"; 
        this.method(); 
    } 
}
