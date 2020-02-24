public class People {

        private String Login;
        private Integer Password;



        void info (){
            System.out.println("User information:");
            System.out.println("User login: " + Login +  "/n User Password " + Password);



        }

        public String getLogin() {
            return Login;
        }

        public Integer getPassword() {
            return Password;
        }

        public void setLogin(String login) {
            Login = login;
        }

        public void setPassword(Integer password) {
            this.Password = password;
        }
    }


