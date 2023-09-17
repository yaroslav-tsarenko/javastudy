import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import UseStateExample from './examples/UseStateExample';
import reportWebVitals from './reportWebVitals';
import UseEffectExample from "./examples/UseEffectExample";
import UseRefExample from "./examples/UseRefExample";
import UseMemoExample from "./examples/UseMemoExample";

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <React.StrictMode>
        <UseStateExample/>
        <UseEffectExample/>
        <UseRefExample/>
        <UseMemoExample/>
    </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
