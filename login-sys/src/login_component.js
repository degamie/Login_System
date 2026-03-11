import React,{useState} from 'react';
PhoneNum=null;
username=null;userId=null;email=null;password=null;
getUsername=(username)=>{return username;}//Fetching UserName in App
function login(){
   const {
    register,
       handleSubmit,formState:{errors},
}=useForm();

const [email,setEmail]=useState('');
const [password,setPassword]=useState('');
const [error,seterror]=useState('');
var username="Sarthak";
const handleChane=(e)={
setCredentials({...credentials,[e.target.name]:e.target.value});
}
const OnSubmit=(data)=>{
const userData=JSON.parse(LocalStorage.getItem(data.email));
if(userData){
console.log("UserData Successfully logged in");
else console.log("Email nd Password Not matched and Not Found!,Pls Try Again!");

}

return (
        <>
            <h2>Login Form</h2>

            <form className="App" onSubmit={handleSubmit(onSubmit)}>
                <input
                    type="email"
                    {...register("email", { required: true })}
                    placeholder="Email"
                />
                {errors.email && <span style={{ color: "red" }}>*Email* is mandatory</span>}

                <input
                    type="password"
                    {...register("password", { required: true })}
                    placeholder="Password"
                />
                {errors.password && <span style={{ color: "red" }}>*Password* is mandatory</span>}

                <input type="submit" style={{ backgroundColor: "#a1eafb" }} />
            </form>
        </>
    );
}
}

