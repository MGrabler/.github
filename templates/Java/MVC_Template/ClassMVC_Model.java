#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};
#end
// ----------------------------------------------------------------------------------------------------------------------------------
import org.springframework.data.jpa.domain.AbstractPersistable;
import javax.persistence.*;
// ----------------------------------------------------------------------------------------------------------------------------------
#parse("File Header.java")
// ----------------------------------------------------------------------------------------------------------------------------------

@Entity
@Table(name = "${NAME}")
public class ${NAME} extends AbstractPersistable<Long>
{	// TODO implement domain model
    //---------------------------------- Predicate ----------------------------------------------------------------------------------

    //---------------------------------- Comparator ---------------------------------------------------------------------------------

    //---------------------------------- Attributes ---------------------------------------------------------------------------------
    @Version
    private Integer version;
    //---------------------------------- Constructor --------------------------------------------------------------------------------

    // --------------------------------- Initialization -----------------------------------------------------------------------------

    // --------------------------------- Checking -----------------------------------------------------------------------------------

    //---------------------------------- Getter -------------------------------------------------------------------------------------

    //---------------------------------- Setter -------------------------------------------------------------------------------------

    // --------------------------------- Add/Remove----------------------------------------------------------------------------------

    // --------------------------------- Min/Max - Basic calculation ----------------------------------------------------------------

    //---------------------------------- Others -------------------------------------------------------------------------------------

    // --------------------------------- Equals/HashCode ----------------------------------------------------------------------------

    // --------------------------------- Comparabel ---------------------------------------------------------------------------------

    // --------------------------------- Clone --------------------------------------------------------------------------------------

    // --------------------------------- Iterator -----------------------------------------------------------------------------------

    //---------------------------------- Filesystem ---------------------------------------------------------------------------------

    // --------------------------------- Load/Save ----------------------------------------------------------------------------------

    // --------------------------------- Import/Export ------------------------------------------------------------------------------

    //---------------------------------- toString -----------------------------------------------------------------------------------

    // --------------------------------- Inner Class --------------------------------------------------------------------------------
}