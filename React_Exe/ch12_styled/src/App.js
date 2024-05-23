import logo from "./logo.svg";
import "./App.css";
import ReactButton from "./ex01_non_styled/ReactButton";
import StyledButton from "./ex01_styled/StyledButton";

function App() {
  return (
    <>
      <ReactButton>안녕하세요</ReactButton>
      <StyledButton>감사합니다</StyledButton>
    </>
  );
}

export default App;
