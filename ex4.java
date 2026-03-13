public class ex4 {

    static class Animal {
        private String animalName;
        private String ownerName;
        private int age;

        public Animal(String animalName, String ownerName, int age) {
            this.animalName = animalName;
            this.ownerName = ownerName;
            setAge(age);
        }

        public String getAnimalName() {
            return animalName;
        }

        public void setAnimalName(String animalName) {
            this.animalName = animalName;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
            this.age = age;
        }

        @Override
        public String toString() {
            return animalName + ", " + ownerName + ", " + age;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Animal a = (Animal) obj;
            return age == a.age &&
                    animalName.equals(a.animalName) &&
                    ownerName.equals(a.ownerName);
        }
    }

    static class Dog extends Animal {
        private String breed;

        public Dog(String animalName, String ownerName, int age, String breed) {
            super(animalName, ownerName, age);
            this.breed = breed;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        @Override
        public String toString() {
            return getAnimalName() + ", " + getOwnerName() + ", " + getAge() + ", Dog, " + breed;
        }

        @Override
        public boolean equals(Object obj) {
            if (!super.equals(obj)) return false;
            Dog d = (Dog) obj;
            return breed.equals(d.breed);
        }
    }

    public static void main(String[] args) {
        Animal a1 = new Animal("Cat", "Ali", 3);
        Dog d1 = new Dog("buddy", "Nazim", 5, "Golden Retriever");

        System.out.println(a1);
        System.out.println(d1);
    }
}