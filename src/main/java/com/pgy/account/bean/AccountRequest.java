package com.pgy.account.bean;

/**
 * The account request.
 *
 * @author Felix
 */
public class AccountRequest {

    public static final class Builder {
        private Long parentId;
        private String accountName;
        private int status;

        private Builder() {
        }

        public static Builder anAccountRequest() {
            return new Builder();
        }

        public Builder withParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }

        public Builder withAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder withStatus(int status) {
            this.status = status;
            return this;
        }

        public AccountRequest build() {
            AccountRequest accountRequest = new AccountRequest();
            accountRequest.setParentId(parentId);
            accountRequest.setAccountName(accountName);
            accountRequest.setStatus(status);
            return accountRequest;
        }
    }

    private Long parentId;
    private String accountName;
    private int status;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
