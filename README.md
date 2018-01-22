## makes heroku-based odata services for consuming with Salesforce connect

---

## To add a new service:

1. create a new folder in src/main/java/com/herokuapp/odata (easiest is to copy from an existing one)
2. on each thing under entities, change the line `package com.herokuapp.odata.hero.entities;` to match your folder name
3. add your service in resources/META-INF-persistence.xml
4. add your service in Index.java
5. add your service to web.xml (servlet)
6. Also in web.xml, make a servlet mapping


# ok, and you really want data right?
1. create the table and populate it using heroku pg:psql or the Adminium plugin
2. if you used a schema, make sure your entry in resources/META-INF-persistence.xml matches the schema, or is `public` for the default