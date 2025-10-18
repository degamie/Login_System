import React from 'react'

function login() {
    const onSubmit = (data) => {
        localStorage.setItem("data.email", JSON.stringify({name: data.name, password: data.password}));

  return (
    <div>login</div>
  )
}
}

export default login;
//this.Ref = React.createRef()
