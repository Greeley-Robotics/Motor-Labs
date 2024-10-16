package frc.robot.subsystems;

// import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MOTORLABSConstants;
import frc.robot.Constants.DrivetrainConstants;
import frc.robot.commands.MOTORLABS;

public class Drivetrain extends SubsystemBase {
    public final PWMSparkMax sparkMax1;
    public final PWMSparkMax sparkMax2;
    public final PWMSparkMax sparkMax3;
    public final PWMSparkMax sparkMax4;

    public Drivetrain() { // Joystick controller
        // controller = new Joystick(MOTORLABSConstants.kDriverControllerPort);
        sparkMax1 = new PWMSparkMax(DrivetrainConstants.kMotorControllerPort0);
        sparkMax2 = new PWMSparkMax(DrivetrainConstants.kMotorControllerPort1);
        sparkMax3 = new PWMSparkMax(DrivetrainConstants.kMotorControllerPort2);
        sparkMax4 = new PWMSparkMax(DrivetrainConstants.kMotorControllerPort3);
    }

    public Command driveForwardCommand() {
        return new MOTORLABS(this);
    }
}
