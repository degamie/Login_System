import React from 'react'

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
          const getPassword=(data.Password)=>{return Password;}

          const getEmail=(data.email)=>{return email;}//Fetching Email in Server
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
