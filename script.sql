BEGIN;


CREATE TABLE IF NOT EXISTS public.user_data
(
    user_id bigint NOT NULL,
    email character(60) NOT NULL,
    password character(8) NOT NULL,
    PRIMARY KEY (user_id)
);

CREATE TABLE IF NOT EXISTS public.pharmacy
(
    pharm_id bigint NOT NULL,
    corporate_name character(60) NOT NULL,
    ein_cnpj numeric(14) NOT NULL,
    business_name character(100) NOT NULL,
    email character(60) NOT NULL,
    phone numeric(13),
    mobile numeric(13) NOT NULL,
    address_id_fk bigint NOT NULL,
    PRIMARY KEY (pharm_id)
);

CREATE TABLE IF NOT EXISTS public.address
(
    address_id bigint NOT NULL,
    zip_code numeric(12) NOT NULL,
    street character(50) NOT NULL,
    num numeric(8) NOT NULL,
    district character(50) NOT NULL,
    city character(50) NOT NULL,
    state character(50) NOT NULL,
    complement character(50),
    latitude numeric(10) NOT NULL,
    longitude numeric(10) NOT NULL,
    PRIMARY KEY (address_id)
);

CREATE TABLE IF NOT EXISTS public.medicine
(
    id bigint NOT NULL,
    name character(60) NOT NULL,
    lab_name character(60) NOT NULL,
    dose character(30) NOT NULL,
    description character(200),
    unit_price numeric(20) NOT NULL,
    type character(30) NOT NULL,
    PRIMARY KEY (id)
);
END;