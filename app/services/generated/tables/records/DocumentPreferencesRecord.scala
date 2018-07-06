/**
 * This class is generated by jOOQ
 */
package services.generated.tables.records


import java.lang.String

import javax.annotation.Generated

import org.jooq.Field
import org.jooq.Record2
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.impl.UpdatableRecordImpl

import services.generated.tables.DocumentPreferences


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = Array(
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	),
	comments = "This class is generated by jOOQ"
)
class DocumentPreferencesRecord extends UpdatableRecordImpl[DocumentPreferencesRecord](DocumentPreferences.DOCUMENT_PREFERENCES) with Record3[String, String, String] {

	/**
	 * Setter for <code>public.document_preferences.document_id</code>.
	 */
	def setDocumentId(value : String) : Unit = {
		setValue(0, value)
	}

	/**
	 * Getter for <code>public.document_preferences.document_id</code>.
	 */
	def getDocumentId : String = {
		val r = getValue(0)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.document_preferences.preference_name</code>.
	 */
	def setPreferenceName(value : String) : Unit = {
		setValue(1, value)
	}

	/**
	 * Getter for <code>public.document_preferences.preference_name</code>.
	 */
	def getPreferenceName : String = {
		val r = getValue(1)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.document_preferences.preference_value</code>.
	 */
	def setPreferenceValue(value : String) : Unit = {
		setValue(2, value)
	}

	/**
	 * Getter for <code>public.document_preferences.preference_value</code>.
	 */
	def getPreferenceValue : String = {
		val r = getValue(2)
		if (r == null) null else r.asInstanceOf[String]
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------
	override def key() : Record2[String, String] = {
		return super.key.asInstanceOf[ Record2[String, String] ]
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	override def fieldsRow : Row3[String, String, String] = {
		super.fieldsRow.asInstanceOf[ Row3[String, String, String] ]
	}

	override def valuesRow : Row3[String, String, String] = {
		super.valuesRow.asInstanceOf[ Row3[String, String, String] ]
	}
	override def field1 : Field[String] = DocumentPreferences.DOCUMENT_PREFERENCES.DOCUMENT_ID
	override def field2 : Field[String] = DocumentPreferences.DOCUMENT_PREFERENCES.PREFERENCE_NAME
	override def field3 : Field[String] = DocumentPreferences.DOCUMENT_PREFERENCES.PREFERENCE_VALUE
	override def value1 : String = getDocumentId
	override def value2 : String = getPreferenceName
	override def value3 : String = getPreferenceValue

	override def value1(value : String) : DocumentPreferencesRecord = {
		setDocumentId(value)
		this
	}

	override def value2(value : String) : DocumentPreferencesRecord = {
		setPreferenceName(value)
		this
	}

	override def value3(value : String) : DocumentPreferencesRecord = {
		setPreferenceValue(value)
		this
	}

	override def values(value1 : String, value2 : String, value3 : String) : DocumentPreferencesRecord = {
		this.value1(value1)
		this.value2(value2)
		this.value3(value3)
		this
	}

	/**
	 * Create a detached, initialised DocumentPreferencesRecord
	 */
	def this(documentId : String, preferenceName : String, preferenceValue : String) = {
		this()

		setValue(0, documentId)
		setValue(1, preferenceName)
		setValue(2, preferenceValue)
	}
}
