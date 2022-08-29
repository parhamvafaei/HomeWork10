package org.example.entity;

public class Customer {

        private long id;
        private String name;
        private String username;
        private String password;
        public Customer() {}
        public Customer (String username, String password) {
            this.username = username;
            this.password = password;
        }
        public Customer (long id, String name, String username, String password) {
            this.id = id;
            this.name = name ;
            this.username = username;
            this.password = password;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }


        public void setPassword(String password) {
            this.password = password;
        }
}
