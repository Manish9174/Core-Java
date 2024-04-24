    class animal{
        void eat(){
            System.out.println("manish");
        }
    }

    class dog extends animal {
        void eat(){
            System.out.println("jayesh");
        }
    }

    class cat extends animal {
        void eat(){
            System.out.println("harish");
        }
    }

    class lion extends animal{
        void eat(){
            System.out.println("yssss");
        }
    }

    class mainanimal{
        public static void main(String[] args) {
            
            animal a;
            a=new dog();
            a.eat();

            a=new cat();
            a.eat();

            a=new lion();
            a.eat();
        }
    }