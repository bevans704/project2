public class Bank {
    private int amount;
    private string address;
    private string date;
    public string getAmount() {
        return amount;
    }
    public void setAmount(string amount) {
        this.amount = amount;
    }
}

public class IdvAccount extends Bank {
    private string total;
    private string getTotal() {
        return total;
    }
}
public class BizAccount extends Bank {
    private int pending;
    private int getPending() {
        return pending;
}
}
public class Employees extends Bank {
    private int pending;
    private int getPending() {
        return pending;
}
}
public class Deposits extends Bank {
    private int hold;
    private int getHold() {
        return hold;
    }
}
public class Branches extends Bank {
    private string location;
    private int setLocation() {
        return location;
    }
}
public class WireTransfers extends Bank {
    private string country;
    private int getCountry() {
        return country;
}
public class Withdrawals extends Bank {
    private int limit;
    private int getLimit() {
        return limit;
}
}
public class Addresses extends Bank {
    private string hours;
    private int getHours() {
        return hours;
}
}
public class Receipts extends Bank {
    private int finalAmount;
    private int getFinalAmount() {
        return finalAmount;
}
}
