package seedu.exceptions.inventory;

import seedu.exceptions.HealthVaultException;

public class InvalidPriceException extends HealthVaultException {
    public InvalidPriceException(String error) {
        this.error = error;
    }
    @Override
    public void getError(String input) {
        super.getError(input);
    }
}
