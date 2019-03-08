import React, { Component } from "react";
import {Link} from 'react-router-dom';
const urlGetCategories = 'https://dac-java.herokuapp.com/api/customer/getCategoryTree';

class MobileCategoryList extends Component {
    constructor(props) {
        super(props);
        
        this.state ={
            categoryList : []
        }
    }

    componentDidMount() {
        fetch(urlGetCategories, {
            method : 'GET',
            headers : {
                'Content-Type' : 'application/json'
            }
        })
        .then(res=>res.json())
        .then(data =>{
            if(data.status === 'SUCCESS'){
                this.setState({categoryList : data.data});
                console.log(this.state.categoryList);
                
            }
            else if(data.status === 'FAILED'){
                console.log(data.message);
            }
        })
    }

    render() {
        return (
        <div className="mobile-category-list">
            <div className="mobile-category-text">
                <span>Category list</span>
                <span>
                    <i className="fa fa-angle-down" />
                </span>
            </div>
            <div className="mobile-category-content">
                <ul>
                    {
                        this.state.categoryList.map((value,key)=>{
                            return (<li key={key}>
                                        <Link  to ='/'>{value.name}</Link>
                                    </li>)
                        })
                    } 
                </ul>
            </div>
        </div>
        );
    }
}

export default MobileCategoryList;
