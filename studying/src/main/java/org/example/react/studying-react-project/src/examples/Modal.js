import React from "react"
import '../styles/Modal.css'

function Modal(props) {
    if (!props.show) {
        return null
    }
    return (
        <div className="modal">
            <div className="modal-content">
                <div className="modal-header">
                    <h4 className="modal-title">Modal Title</h4>
                </div>
                <div className="modal-body">Modal Body</div>
                <div className="modal-footer">
                    <button className="button">Close</button>
                </div>
                <div className="modal-footer">
                    <button onClick={props.onClose} className="button">Close</button>
                </div>
            </div>
        </div>
    )
}

export default Modal