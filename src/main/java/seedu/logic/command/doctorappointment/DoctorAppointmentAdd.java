package seedu.logic.command.doctorappointment;

import seedu.logic.command.AppointmentActions;
import seedu.logic.command.Command;
import seedu.storage.DoctorAppointmentStorage;
import seedu.ui.DoctorAppointmentUI;

import java.io.IOException;

public class DoctorAppointmentAdd extends Command {

    private String[] input;

    public DoctorAppointmentAdd(String[] parsedInput) {
        input = parsedInput;
    }

    @Override
    public void execute(AppointmentActions appointment, DoctorAppointmentUI ui) throws IOException {
        System.out.println("IN ADD EXECUTE");

        AppointmentActions.addAppointment(input);
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
