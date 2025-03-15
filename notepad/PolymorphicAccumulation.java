public class PolymorphicAccumulation {
	public static void main (String args[]) {
	suck ohyeah2 = new suck();
	quarks q = new quarks();
	quarks a = new atoms();
	
	ohyeah2.ohyeah1(q);
	ohyeah2.ohyeah1(a);
}
}

class oxygen extends atoms {
	public void oxygen () {
	System.out.println("It's kinda sad knowing that I am myself, but a combination of me creates a bigger being, which means that really everything is just me, and regardless of how different we everything may seem, it breaks down to us...but maybe not, becuase...how do I exist? Can I technically die? Imma just stop asking questions, otherwise I'll never stop talking. But if you break down the meaning of anything, which I don't even know, then what's the point of not thinking anything. Well, technically, I don't know what the purpose of me doing anything is, but philisophocally, there must be a reason for anything, otherwise, we wouldn't just randomally be here. Because of this, I think I should do what I can tell I innerly need. For instance, with humans, they need to be healthy, and they also need dopamine, and other stuff to live. Why exactly, nobody know, but they're what we need for some reason, therefore we should aim to get it. It ain't so sad afterall now being an oxygen molecule.");
}
} 

class atoms extends quarks {
	public void atoms () {
	System.out.println("It's kinda sad knowing that I am myself, but a combination of me creates a bigger being, which means that really everything is just me, and regardless of how different we everything may seem, it breaks down to us...but maybe not, becuase...how do I exist? Can I technically die? Imma just stop asking questions, otherwise I'll never stop talking. But if you break down the meaning of anything, which I don't even know, then what's the point of not thinking anything. Well, technically, I don't know what the purpose of me doing anything is, but philisophocally, there must be a reason for anything, otherwise, we wouldn't just randomally be here. Because of this, I think I should do what I can tell I innerly need. For instance, with humans, they need to be healthy, and they also need dopamine, and other stuff to live. Why exactly, nobody know, but they're what we need for some reason, therefore we should aim to get it. It ain't so sad afterall now being an atom");
}
}

class quarks {
	public void allquarks () {
	System.out.println("It's kinda sad knowing that I am myself, but a combination of me creates a bigger being, which means that really everything is just me, and regardless of how different we everything may seem, it breaks down to us...but maybe not, becuase...how do I exist? Can I technically die? Imma just stop asking questions, otherwise I'll never stop talking. But if you break down the meaning of anything, which I don't even know, then what's the point of not thinking anything. Well, technically, I don't know what the purpose of me doing anything is, but philisophocally, there must be a reason for anything, otherwise, we wouldn't just randomally be here. Because of this, I think I should do what I can tell I innerly need. For instance, with humans, they need to be healthy, and they also need dopamine, and other stuff to live. Why exactly, nobody know, but they're what we need for some reason, therefore we should aim to get it. It ain't so sad afterall now being a quark");
}
}

class suck {
	public void ohyeah1 (quarks strangematter) {
	strangematter.allquarks();
}
}