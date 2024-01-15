package com.backend.linlafashion.model;

public class UserDTO {
    private String user_id;
    private String username;
    private String email;
    private String password;
    private String first_name;
    private String last_name;
    private String phone_number;
    private String create_at;

    //constructor
    public UserDTO(String user_id, String username, String email, String password,
                   String first_name, String last_name, String phone_number, String create_at) {
    }

    public UserDTO(){
    }

    //get set
    public String getUser_id(){
        return user_id;
    }

    public void setUser_id(String user_id){
        this.user_id = user_id;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getFirst_name(){
        return first_name;
    }

    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }

    public String getLast_name(){
        return last_name;
    }

    public void setLast_name(String last_name){
        this.last_name = last_name;
    }

    public String getPhone_number(){
        return phone_number;
    }

    public void setPhone_number(String phone_number){
        this.phone_number = phone_number;
    }

    public String getCreate_at(){
        return create_at;
    }

    public void setCreate_at(String create_at){
        this.create_at = create_at;
    }

    @Override
    public String toString(){
        return "User{" +
                "user_id=" + user_id +
                ",username=" + username +
                ",email=" + email +
                ",password=" + password +
                ",first_name=" + first_name +
                ",last_name=" + last_name +
                ", phone_number=" + phone_number +
                ", create_at=" + create_at +
                "}";
    }
}
