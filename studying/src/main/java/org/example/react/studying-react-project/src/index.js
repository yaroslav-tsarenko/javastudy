import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './examples/App';
import reportWebVitals from './reportWebVitals';
import UseEffectExample from "./examples/UseEffectExample";
import UseRefExample from "./examples/UseRefExample";

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <React.StrictMode>
        <App/>
        <UseEffectExample/>
        <UseRefExample/>
    </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
