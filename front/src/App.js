import GoogleLogin from 'react-google-login';
import './App.css';

function App() {
  return (
    <div className="App">
      <GoogleLogin
        clientId={''}//구글클라우드아이디 입력
      />
    </div>
  );
}

export default App;