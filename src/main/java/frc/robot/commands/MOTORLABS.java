/*
 * ONLY CODE IN THIS FILE
 */

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.MOTORLABSConstants;
import frc.robot.subsystems.Drivetrain;

public class MOTORLABS extends Command {
    private final Drivetrain m_drivetrain;

    // You could also change variables in the Constants class if you want.
    private double valToSet = MOTORLABSConstants.kDriveForwardSpeed;

    public MOTORLABS(Drivetrain subsystem) {
        m_drivetrain = subsystem;
        addRequirements(m_drivetrain);
    }

    @Override
    public void initialize() {
        /*
         * CODE HERE 
         */
    }

    @Override
    public void execute() {
        /*
         * CODE HERE 
         */
    }

    @Override 
    public void end(boolean interrupted) {
        /*
         * CODE HERE 
         */
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
