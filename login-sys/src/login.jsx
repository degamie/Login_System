import React from 'react'

function login() {
    const onSubmit = (data) => {
        const userData=localStorage.setItem("data.email", JSON.stringify({name: data.name, password: data.password}));
        if(userData){
            if(userData.password===data.password){
                console.log(userData.name+"Logged In Successfully!");}
            }
        else console.log("User Email and Password Unmatched");

  return (
      <h2>Login Form</h2>
      <form className="App" OnSubmit={handleSubmit(OnSubmit)}>
          <input
            type="Email",
            {register("email")}
            {required:true}
            placeholder="Email"/>
    <div>login</div>
  )
}
}

export default login;
//this.Ref = React.createRef()
