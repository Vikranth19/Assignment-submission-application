import './App.css';

function App() {

  console.log("App started");

  const reqBody = {
    "username" : "vikranth",
    "password" : "itssecret"
  }

  fetch("api/auth/login", {
    "headers": {
      "Content-Type" : "application/json"
    },
    "method" : "post",
    "body" : JSON.stringify(reqBody)
  })
  .then((response) => Promise.all([response.json(), response.headers]))
  .then(([body, headers]) => {
    const authValue = headers.get("authorization")
    console.log(authValue);
  });
  

  return (
    <div className="App">
      <h1>
        Assignment app
      </h1>
    </div>
  );
}

export default App;
