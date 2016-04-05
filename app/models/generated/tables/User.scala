/**
 * This class is generated by jOOQ
 */
package models.generated.tables


import java.lang.Boolean
import java.lang.Class
import java.lang.String
import java.time.OffsetDateTime
import java.util.Arrays
import java.util.List

import javax.annotation.Generated

import models.generated.DefaultSchema
import models.generated.Keys
import models.generated.tables.records.UserRecord

import org.jooq.Field
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.TableImpl


object User {

	/**
	 * The reference instance of <code>user</code>
	 */
	val USER = new User
}

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
class User(alias : String, aliased : Table[UserRecord], parameters : Array[ Field[_] ]) extends TableImpl[UserRecord](alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "") {

	/**
	 * The class holding records for this type
	 */
	override def getRecordType : Class[UserRecord] = {
		classOf[UserRecord]
	}

	/**
	 * The column <code>user.username</code>.
	 */
	val USERNAME : TableField[UserRecord, String] = createField("username", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

	/**
	 * The column <code>user.email</code>.
	 */
	val EMAIL : TableField[UserRecord, String] = createField("email", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

	/**
	 * The column <code>user.password_hash</code>.
	 */
	val PASSWORD_HASH : TableField[UserRecord, String] = createField("password_hash", org.jooq.impl.SQLDataType.CLOB, "")

	/**
	 * The column <code>user.salt</code>.
	 */
	val SALT : TableField[UserRecord, String] = createField("salt", org.jooq.impl.SQLDataType.CLOB, "")

	/**
	 * The column <code>user.member_since</code>.
	 */
	val MEMBER_SINCE : TableField[UserRecord, OffsetDateTime] = createField("member_since", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false), "")

	/**
	 * The column <code>user.active</code>.
	 */
	val ACTIVE : TableField[UserRecord, Boolean] = createField("active", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaulted(true), "")

	/**
	 * Create a <code>user</code> table reference
	 */
	def this() = {
		this("user", null, null)
	}

	/**
	 * Create an aliased <code>user</code> table reference
	 */
	def this(alias : String) = {
		this(alias, models.generated.tables.User.USER, null)
	}

	private def this(alias : String, aliased : Table[UserRecord]) = {
		this(alias, aliased, null)
	}

	override def getPrimaryKey : UniqueKey[UserRecord] = {
		Keys.PK_USER
	}

	override def getKeys : List[ UniqueKey[UserRecord] ] = {
		return Arrays.asList[ UniqueKey[UserRecord] ](Keys.PK_USER)
	}

	override def as(alias : String) : User = {
		new User(alias, this)
	}

	/**
	 * Rename this table
	 */
	def rename(name : String) : User = {
		new User(name, null)
	}
}
