package com.codeoftheweb.salvo;
import javax.persistence.*;
@Entity
    public class Player<onetoMany> {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")//???????
        private long id;
        private String userName;

        @onetoMany(fetch = FetchType.EAGER)//???????????
        @JoinColumn(name="owner_id")
        private Player owner;

        private String email;
        private String password;


        public Player() {}

        public Player (String userName, String email, String password) {
            this.userName = userName;
            this.email = email;
            this.password = password;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

         public long getId() {
        return id;
        }

        public void setId(long id) {
             this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String toString() {
            return userName;
        }

        public Player getOwner() {
        return owner;
        }

        public void setOwner(Player owner) {
        this.owner = owner;
        }
}















