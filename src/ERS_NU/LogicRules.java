/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ERS_NU;

/**
 *
 * @author romeoespedido
 */
public class LogicRules {
    protected String ruleCategoryName;

    public LogicRules(String categoryName) {
        this.ruleCategoryName = categoryName;
    }

    // A generic method that child classes will inherit and reuse
    protected boolean isLimitBroken(double timeUsed, double maxLimit) {
        return timeUsed > maxLimit;
    }
}
