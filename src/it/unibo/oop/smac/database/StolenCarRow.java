package it.unibo.oop.smac.database;

import it.unibo.oop.smac.datatype.LicensePlate;
import it.unibo.oop.smac.datatype.I.IInfoStolenCar;

import java.util.Date;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "StolenCar")
public class StolenCarRow implements IInfoStolenCar {
	public static final String LICENSEPLATE_FIELD_NAME = "licensePlate";
	public static final String DATAINSERIMENTO_FIELD_NAME = "dataInserimento";

	@DatabaseField(generatedId = true)
	private int id;

	@DatabaseField(columnName = LICENSEPLATE_FIELD_NAME, dataType = DataType.STRING)
	private String licensePlate;

	@DatabaseField(columnName = DATAINSERIMENTO_FIELD_NAME, canBeNull = false)
	private Date dataInserimento;

	StolenCarRow() {
	}

	public LicensePlate getLicensePlate() {
		return new LicensePlate(licensePlate);
	}

	public void setLicensePlate(LicensePlate licensePlate) {
		this.licensePlate = licensePlate.toString();
	}

	public Date getDataInserimento() {
		return dataInserimento;
	}

	public void setDataInserimento(Date dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

}