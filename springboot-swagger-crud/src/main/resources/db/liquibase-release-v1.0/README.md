
# Database Delivery - Version v1.0

This release contains the Liquibase changelog for version 1.0.

## Instructions

1. Make sure Java and Liquibase CLI are installed.
2. Ensure your MySQL DB is running.
3. Run the command below to create the database:

```bash
liquibase \
  --driver=com.mysql.cj.jdbc.Driver \
  --classpath=/path/to/mysql-connector-j-8.1.0.jar \
  --url="jdbc:mysql://localhost:3306/oumaima" \
  --username=appuser \
  --password=apppassword \
  --changeLogFile=changelog/db.changelog-master.xml \
  update
c