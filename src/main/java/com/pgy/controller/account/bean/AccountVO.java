package com.pgy.controller.account.bean;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pgy.account.bean.Account;
import com.pgy.account.bean.AccountConfig;
import com.pgy.account.bean.AccountStatus;
import com.pgy.auth.bean.Role;

/**
 * Account VO.
 *
 * @author Felix
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountVO {

    public static final class Builder {
        private long id;
        private String accountName;
        private String accountPassword;
        private String username;
        private Role role;
        private long balance;
        private String email;
        private String phone;
        private String permission;
        private long parentId;
        private AccountStatus status;
        private Date beginTime;
        private Date endTime;
        private AccountConfig config;
        private long teacherCount;
        private long parentCount;

        private Builder() {
        }

        public static Builder anAccountVO() {
            return new Builder();
        }

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Builder withAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder withAccountPassword(String accountPassword) {
            this.accountPassword = accountPassword;
            return this;
        }

        public Builder withUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder withRole(Role role) {
            this.role = role;
            return this;
        }

        public Builder withBalance(long balance) {
            this.balance = balance;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder withPermission(String permission) {
            this.permission = permission;
            return this;
        }

        public Builder withParentId(long parentId) {
            this.parentId = parentId;
            return this;
        }

        public Builder withStatus(AccountStatus status) {
            this.status = status;
            return this;
        }

        public Builder withBeginTime(Date beginTime) {
            this.beginTime = beginTime;
            return this;
        }

        public Builder withEndTime(Date endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder withConfig(AccountConfig config) {
            this.config = config;
            return this;
        }

        public Builder withTeacherCount(long teacherCount) {
            this.teacherCount = teacherCount;
            return this;
        }

        public Builder withParentCount(long parentCount) {
            this.parentCount = parentCount;
            return this;
        }

        public Builder withAccount(Account account) {
            this.id = account.getId();
            this.accountName = account.getAccountName();
            this.username = account.getUsername();
            this.role = account.getRole();
            this.balance = account.getBalance();
            this.email = account.getEmail();
            this.phone = account.getPhone();
            this.permission = account.getPermission();
            this.parentId = account.getParentId();
            this.status = account.getStatus();
            this.beginTime = account.getBeginTime();
            this.endTime = account.getEndTime();
            return this;
        }

        public AccountVO build() {
            AccountVO accountVO = new AccountVO();
            accountVO.setId(id);
            accountVO.setAccountName(accountName);
            accountVO.setAccountPassword(accountPassword);
            accountVO.setUsername(username);
            accountVO.setRole(role);
            accountVO.setBalance(balance);
            accountVO.setEmail(email);
            accountVO.setPhone(phone);
            accountVO.setPermission(permission);
            accountVO.setParentId(parentId);
            accountVO.setStatus(status);
            accountVO.setBeginTime(beginTime);
            accountVO.setEndTime(endTime);
            accountVO.setConfig(config);
            accountVO.setTeacherCount(teacherCount);
            accountVO.setParentCount(parentCount);
            return accountVO;
        }
    }

    private long id;
    private String accountName;
    private String accountPassword;
    private String username;
    private Role role;
    private long balance;
    private String email;
    private String phone;
    private String permission;
    private long parentId;
    private AccountStatus status;
    private Date beginTime;
    private Date endTime;
    private AccountConfig config;
    private long teacherCount;
    private long parentCount;

    public Account buildAccount() {
        Account account = new Account();
        account.setId(id);
        account.setAccountName(accountName);
        account.setAccountPassword(accountPassword);
        account.setUsername(username);
        account.setRole(role);
        account.setBalance(balance);
        account.setEmail(email == null ? StringUtils.EMPTY : email);
        account.setPhone(phone == null ? StringUtils.EMPTY : phone);
        account.setPermission(permission == null ? StringUtils.EMPTY : permission);
        account.setParentId(parentId);
        account.setStatus(status);
        account.setBeginTime(beginTime);
        account.setEndTime(endTime);
        return account;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public AccountConfig getConfig() {
        return config;
    }

    public void setConfig(AccountConfig config) {
        this.config = config;
    }

    public long getTeacherCount() {
        return teacherCount;
    }

    public void setTeacherCount(long teacherCount) {
        this.teacherCount = teacherCount;
    }

    public long getParentCount() {
        return parentCount;
    }

    public void setParentCount(long parentCount) {
        this.parentCount = parentCount;
    }
}
