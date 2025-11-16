import React from 'react'

//WID(16/11/2025)//Sarthak Mittal (Degamiesign)
function login() {
  const getData=(data)=>{
    return data;
  }
const setData=(data)=>{
    this.data=data;}
    const onSubmit = (data) => {
        const userData=localStorage.setItem("data.email", JSON.stringify({name: data.name, password: data.password}));
        if(userData){
            if(userData.password===data.password){
                console.log(userData.name+"Logged In Successfully!");}
            }
        else console.log("User Email and Password Unmatched");
          }
      const getAllByUserName=(UserName)=>{return UserName;}//Fetching UserNAme in Server
          const getUserID=(UserId)=>{return UserId;}//fetching UserId in Server
          const setUserId=(UserId)=>{this.UserId=UserId;}//Binding UserId In Server
          const getPassword=(data.Password)=>{return Password;}
          const updateAllByUserId=(UserId)=>{getUserID(UserId)+setUserId(UserId)+1;}//Updating UserId in Server
          const setPassword=(data.Password)=>{ this.Password=Password;}//Binding Password
          const updateAllByPassword=(data.password)=>{getPassword(Password)+setPassword(password)+1;}//Updating All Password in Server
          const getEmail=(data.email)=>{return email;}//Fetching Email in Server
          const setEmail=(data.email)=>{return email;}// Retrieving Email in Server
          const updateAllByEmail=(data.email)=>{getEmail(email)+setEmail(email);}//Updating All Emails in Server
  return (
      <h2>Login Form</h2>
      <form className="App" OnSubmit={handleSubmit(OnSubmit)}>
          <input
            type="Email"
            {register("email")}
            {required:true}
            placeholder="Email"/>
 {errors.email && <span style= {{<color:"red"}}>*Email* is compulsory</span>}
              <input
                        type="Password"
                        {register("Password")}
                        {required:true}
                        placeholder="Password"/>
                          {errors.Password && <span style= {{<color:"red"}}>*Password* is compulsory</span>}
              <input type="Submit" style={backgroundColor:"#a1eafb"}>

    <div>login</div>
  )
}
}

export default login;
//this.Ref = React.createRef()
