import React, { Component } from 'react';
import {Button} from 'react-bootstrap';
import {Link} from 'react-router-dom';
class UserLink extends Component {
    constructor(props) {
        super(props);
        
        this.state = {
            name : sessionStorage.getItem("name"),
            role : ''
        }
    }
    
    logout = () =>{
        if(localStorage.getItem("token")){
            localStorage.removeItem("token");
            sessionStorage.removeItem("name");
            this.props.changeAuthenticated();
        }
    }

    render() {
        const role = this.props.getRole();
        return (
            <div className="links-bar">
                <Button variant="link" className="menu-action-link">Hello {this.state.name}</Button>
                <div className="menu-action">
                    <ul>
                        <li>
                            <Link to="/customer/profile">User Information</Link>
                        </li>                    
                        {                            
                            role === 'ROLE_ADMIN' || role === 'ROLE_SHOP' ? (
                                <li><a href="javascript:void(0)">Management Campaign</a></li>
                            ) : null
                        }
                        <li>
                            <Link to="/" onClick={this.logout}>Logout</Link>
                        </li>
                    </ul>
                </div>
            </div>
        );
    }
}

export default UserLink;