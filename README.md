<h1>Java Employee Tracking Application</h1>
<h2>Objectives</h2>
<ul>
<li>Understand the relationships, one to many and many to many.</li>
<li>Be able to implement one-to-many and many-to-many relationships between models with Spring JPA + Hibernate.</li>
</ul>
<h2>Brief</h2>
<p>Create an application for a company to track their employees, departments and projects.</p>
<h2>MVP</h2>
<p>A Department must have one-to-many with Employee: A Department has many Employees. An Employee must have a many-to-many with a Project: Many Employees can be part of a Project and a Project can have many different Employees in it.</p>
<p>Implement the following models to achieve the above relationships:</p>
<p>An Employee must:</p>
<ul>
<li>have a first name</li>
<li>have last name</li>
<li>have an employee number</li>
<li>be able to be assigned to multiple projects</li>
</ul>
<p>A Department must:</p>
<ul>
<li>have a name</li>
<li>be able to add multiple employees</li>
</ul>
<p>A Project must:</p>
<ul>
<li>have a name</li>
<li>have a duration in number of days</li>
<li>be able to add multiple employees</li>
</ul>
