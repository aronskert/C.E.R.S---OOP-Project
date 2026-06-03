/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ERS_NU;

/**
 *
 * @author romeoespedido
 */
public class VenueRules extends LogicRules {
    
    public VenueRules() {
        super("FMO Venue Time Limits"); // Passes the name up to the Parent constructor
    }

    // This method checks everything and returns the error message, or "PASS" if valid
    public String evaluateRules(String venue, String eventType, double durationHours, double durationDays, int startHour24) {
        
        if (venue.equals("Function Hall")) {
            if (isLimitBroken(durationDays, 3.0)) return "Function Hall can only be reserved for up to 3 days.";
        }

        if (venue.equals("Gym")) {
            if (startHour24 < 8) return "Gym reservations must start at 8:00 AM or later.";
            
            if (eventType.equals("Student Event")) {
                if (isLimitBroken(durationHours, 4.0)) return "Students may reserve the Gym for a maximum of 4 hours.";
            } else if (!eventType.equals("National University Dasmarinas event")) {
                if (isLimitBroken(durationHours, 8.0)) return "Non-students may reserve the Gym for a maximum of 8 hours.";
            }
        }

        if (venue.equals("3rd Floor")) {
            if (eventType.equals("Student Event")) {
                if (isLimitBroken(durationHours, 5.0)) return "Students may reserve the 3rd Floor for a maximum of 5 hours.";
            } else {
                if (isLimitBroken(durationDays, 7.0)) return "The 3rd Floor can only be reserved for up to 1 week (7 days).";
            }
        }

        if (venue.equals("AVR ROOM")) {
            if (isLimitBroken(durationDays, 3.0)) return "The AVR Room can only be reserved for up to 3 days.";
            if (eventType.equals("Student Event") && isLimitBroken(durationHours, 5.0)) {
                return "Students may reserve the AVR Room for a maximum of 5 hours.";
            }
        }

        return "PASS"; // If no rules are broken!
    }
}
