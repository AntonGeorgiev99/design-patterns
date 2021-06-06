public class ObserverMain {

    Student s = new Student(1, "A", "1991-01-01");

    Observer o1 = new View1(s);
    Observer o2 = new View2(s);
		s.reg
		s.register(o2);


    View3 v = new View3(s);
		v.change();
}


