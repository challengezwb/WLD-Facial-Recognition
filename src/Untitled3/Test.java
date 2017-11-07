/*
 * MATLAB Compiler: 4.18.1 (R2013a)
 * Date: Wed Apr 27 12:43:33 2016
 * Arguments: "-B" "macro_default" "-W" "java:Untitled3,Test" "-T" "link:lib" "-d" 
 * "F:\\WLD\\WLD\\Untitled3\\src" "-w" "enable:specified_file_mismatch" "-w" 
 * "enable:repeated_file" "-w" "enable:switch_ignored" "-w" "enable:missing_lib_sentinel" 
 * "-w" "enable:demo_license" "-v" 
 * "class{Test:C:\\Users\\challengezwb\\Desktop\\abs.m,C:\\Users\\challengezwb\\Desktop\\conv2.m}" 
 */

package Untitled3;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;
import java.util.*;

/**
 * The <code>Test</code> class provides a Java interface to the M-functions
 * from the files:
 * <pre>
 *  C:\\Users\\challengezwb\\Desktop\\abs.m
 *  C:\\Users\\challengezwb\\Desktop\\conv2.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a <code>Test</code> instance when 
 * it is no longer needed to ensure that native resources allocated by this class are 
 * properly freed.
 * @version 0.0
 */
public class Test extends MWComponentInstance<Test>
{
    /**
     * Tracks all instances of this class to ensure their dispose method is
     * called on shutdown.
     */
    private static final Set<Disposable> sInstances = new HashSet<Disposable>();

    /**
     * Maintains information used in calling the <code>abs</code> M-function.
     */
    private static final MWFunctionSignature sAbsSignature =
        new MWFunctionSignature(/* max outputs = */ 0,
                                /* has varargout = */ false,
                                /* function name = */ "abs",
                                /* max inputs = */ 0,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>conv2</code> M-function.
     */
    private static final MWFunctionSignature sConv2Signature =
        new MWFunctionSignature(/* max outputs = */ 0,
                                /* has varargout = */ false,
                                /* function name = */ "conv2",
                                /* max inputs = */ 0,
                                /* has varargin = */ false);

    /**
     * Shared initialization implementation - private
     */
    private Test (final MWMCR mcr) throws MWException
    {
        super(mcr);
        // add this to sInstances
        synchronized(Test.class) {
            sInstances.add(this);
        }
    }

    /**
     * Constructs a new instance of the <code>Test</code> class.
     */
    public Test() throws MWException
    {
        this(Untitled3MCRFactory.newInstance());
    }
    
    private static MWComponentOptions getPathToComponentOptions(String path)
    {
        MWComponentOptions options = new MWComponentOptions(new MWCtfExtractLocation(path),
                                                            new MWCtfDirectorySource(path));
        return options;
    }
    
    /**
     * @deprecated Please use the constructor {@link #Test(MWComponentOptions componentOptions)}.
     * The <code>com.mathworks.toolbox.javabuilder.MWComponentOptions</code> class provides API to set the
     * path to the component.
     * @param pathToComponent Path to component directory.
     */
    public Test(String pathToComponent) throws MWException
    {
        this(Untitled3MCRFactory.newInstance(getPathToComponentOptions(pathToComponent)));
    }
    
    /**
     * Constructs a new instance of the <code>Test</code> class. Use this constructor to 
     * specify the options required to instantiate this component.  The options will be 
     * specific to the instance of this component being created.
     * @param componentOptions Options specific to the component.
     */
    public Test(MWComponentOptions componentOptions) throws MWException
    {
        this(Untitled3MCRFactory.newInstance(componentOptions));
    }
    
    /** Frees native resources associated with this object */
    public void dispose()
    {
        try {
            super.dispose();
        } finally {
            synchronized(Test.class) {
                sInstances.remove(this);
            }
        }
    }
  
    /**
     * Invokes the first m-function specified by MCC, with any arguments given on
     * the command line, and prints the result.
     */
    public static void main (String[] args)
    {
        try {
            MWMCR mcr = Untitled3MCRFactory.newInstance();
            mcr.runMain( sAbsSignature, args);
            mcr.dispose();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
    /**
     * Calls dispose method for each outstanding instance of this class.
     */
    public static void disposeAllInstances()
    {
        synchronized(Test.class) {
            for (Disposable i : sInstances) i.dispose();
            sInstances.clear();
        }
    }

    /**
     * Provides the interface for calling the <code>abs</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void abs(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sAbsSignature);
    }

    /**
     * Provides the interface for calling the <code>abs</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void abs(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sAbsSignature);
    }

    /**
     * Provides the standard interface for calling the <code>abs</code>
     * M-function with 0 input argument.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] abs(Object... rhs) throws MWException
    {
        Object[] lhs = new Object[0];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sAbsSignature), 
                    sAbsSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>conv2</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void conv2(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sConv2Signature);
    }

    /**
     * Provides the interface for calling the <code>conv2</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void conv2(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sConv2Signature);
    }

    /**
     * Provides the standard interface for calling the <code>conv2</code>
     * M-function with 0 input argument.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] conv2(Object... rhs) throws MWException
    {
        Object[] lhs = new Object[0];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sConv2Signature), 
                    sConv2Signature);
        return lhs;
    }
}
