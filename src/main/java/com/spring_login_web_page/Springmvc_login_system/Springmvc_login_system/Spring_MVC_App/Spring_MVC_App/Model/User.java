package com.example.Spring_MVC_App.Spring_MVC_App.Model;

@Getter
@Setter
@AllArgsConstructor
@NoParamsConstructor
public class User {
    @Id
    @GeneratedValue(strategy=GENERATIONTYPE.AUTO)
    @Coloumn(unique=true,nullable=false)
    public Long UserId;
    @Coloumn(unique=false,nullable=true)
    public String userName;
    @Coloumn(unique=false,nullable=true)
    public  String LoginPage ;



}
