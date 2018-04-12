package scala

class Super{
    protected def f(){println("super")}
}

class Sub extends Super{
    f()
}

class Other{
    //f()
}