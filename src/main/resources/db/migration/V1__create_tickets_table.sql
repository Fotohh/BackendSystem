table: tickets

id
    BIGINT
    generated automatically
    primary key

title
    max 200 characters
    required

description
    unrestricted text
    required

customer_email
    max 254 characters
    required

status
    required
    defaults to OPEN
    only:
        OPEN
        IN_PROGRESS
        RESOLVED
        CLOSED

created_at
    timezone-aware timestamp
    required
    defaults to the current time