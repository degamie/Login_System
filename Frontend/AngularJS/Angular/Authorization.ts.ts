import {inject} from "@angular/core";
import { User } from "./User";
export class Authorization {{
    private userid: string;
    private password: string;
    private username: string;
    private email: string;

    constructor(userid: string, password: string, username: string, email: string) {
        this.userid = userid;
        this.password = password;
        this.username = username;
        this.email = email;
    }
}}