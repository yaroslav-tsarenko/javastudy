import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import UseStateExample from './examples/UseStateExample';
import reportWebVitals from './reportWebVitals';
import UseEffectExample from "./examples/UseEffectExample";
import UseRefExample from "./examples/UseRefExample";
import UseMemoExample from "./examples/UseMemoExample";
import Button from "./examples/Button";
import UseCallbackExample from "./examples/UseCallbackExample";
import UseContextExample from "./examples/useContextExample";
import Popup from "./examples/Popup";

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <React.StrictMode>
        <UseStateExample/>
        <UseEffectExample/>
        <UseRefExample/>
        <UseMemoExample/>
        <Button/>
        <UseCallbackExample/>
        <UseContextExample/>
        <Popup/>
    </React.StrictMode>
);
reportWebVitals();
