package Day55_AbstractClass.ReplitAbstract.Abstract1;

//Cats class'ının içine 2 tane method oluşturunuz.
//
//        1) walk isminde bir method oluşturun. Return tipi void olmalıdır. Bu methodun içinde "Cat is walking" yazdırnız.
//
//        2) abstract(soyut) method'un ismi talk olmalıdır. Return tipi void olmalıdır.
//        Not: Çünkü bu method soyuttur, bir body'si(beden) yoktur.

abstract class Cats {

    public void walk(){
        System.out.println("Cat is walking");
    }

    public abstract void talk();
}
