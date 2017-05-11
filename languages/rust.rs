
// 1. Example ----------------------------

pub struct Person {
    name: String,
    age: u8
}

impl Person {
    pub fn new<S: AsRef<str>>(name: S, age: u8) -> Person {
        let name = String::from(name.as_ref());
        
        Person {
            name: name,
            age: age
        }
    }
    
    pub fn is_older_than(&self, age: u8) -> bool {
        self.age > age
    }
}

fn main() {
    let peter = Person::new("Peter A.", 18);
    let anne = Person::new("Anne B.", 42);
    
    println!("{}", anne.name);
    println!("{}", peter.is_older_than(anne.age));
}


// 2. Tests ----------------------------
