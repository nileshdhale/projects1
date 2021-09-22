package com.magento.libraries;

public class MagentoException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public MagentoException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public MagentoException(String message)
    {
        super(message);
    }

    public MagentoException(Throwable cause)
    {
        super(cause);
    }
}
